package com.andromo.dev576782.app537736;

import android.content.Context;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.webkit.URLUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public final class AudioCacheMap implements Parcelable, bu {
    public static final Creator CREATOR;
    public static final AudioCacheMap f481a;
    private String f482b;
    private String f483c;
    private Map f484d;
    private bv f485e;

    static {
        f481a = new AudioCacheMap("", Collections.emptyMap());
        CREATOR = new bw();
    }

    public AudioCacheMap() {
        this.f483c = "";
        this.f482b = eu.m1409c(m905c());
        this.f484d = new HashMap();
    }

    private AudioCacheMap(Parcel parcel) {
        this.f483c = "";
        this.f482b = parcel.readString();
        this.f483c = parcel.readString();
        this.f484d = fh.m1434a(parcel, CacheItem.class);
    }

    private AudioCacheMap(String str, Map map) {
        this.f483c = "";
        this.f482b = eu.m1409c(str);
        this.f484d = new HashMap(map);
    }

    private synchronized void m900a(DataInputStream dataInputStream) {
        if (dataInputStream == null) {
            throw new IllegalArgumentException("DataInputStream is null");
        }
        dataInputStream.readInt();
        this.f482b = dataInputStream.readUTF();
        this.f483c = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        if (readInt > 0) {
            if (this.f484d == null || this.f484d == Collections.emptyMap()) {
                this.f484d = new HashMap(readInt);
            } else {
                this.f484d.clear();
            }
            for (int i = 0; i < readInt; i++) {
                this.f484d.put(dataInputStream.readUTF(), CacheItem.m1096a(dataInputStream));
            }
        } else if (this.f484d != null) {
            this.f484d.clear();
        } else {
            this.f484d = new HashMap();
        }
    }

    private synchronized void m901a(DataInputStream dataInputStream, dm dmVar) {
        if (dmVar == null) {
            m900a(dataInputStream);
        } else {
            if (dataInputStream == null) {
                throw new IllegalArgumentException("DataInputStream should not be null");
            }
            dataInputStream.readInt();
            this.f482b = dataInputStream.readUTF();
            this.f483c = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            if (readInt > 0) {
                if (this.f484d == null || this.f484d == Collections.emptyMap()) {
                    this.f484d = new HashMap(readInt);
                } else {
                    this.f484d.clear();
                }
                for (int i = 0; i < readInt && !dmVar.m1336b(); i++) {
                    this.f484d.put(dataInputStream.readUTF(), CacheItem.m1096a(dataInputStream));
                }
            } else if (this.f484d != null) {
                this.f484d.clear();
            } else {
                this.f484d = new HashMap();
            }
        }
    }

    private synchronized void m902a(DataOutputStream dataOutputStream) {
        if (dataOutputStream == null) {
            throw new IllegalArgumentException("DataOutputStream is null");
        }
        dataOutputStream.writeInt(1);
        dataOutputStream.writeUTF(this.f482b);
        dataOutputStream.writeUTF(this.f483c);
        if (this.f484d != null) {
            dataOutputStream.writeInt(this.f484d.size());
            for (Entry entry : this.f484d.entrySet()) {
                dataOutputStream.writeUTF((String) entry.getKey());
                ((CacheItem) entry.getValue()).m1100a(dataOutputStream);
            }
        } else {
            dataOutputStream.writeInt(0);
        }
    }

    private synchronized void m903a(DataOutputStream dataOutputStream, dm dmVar) {
        if (dmVar == null) {
            m902a(dataOutputStream);
        } else {
            if (dataOutputStream == null) {
                throw new IllegalArgumentException("DataOutputStream is null");
            }
            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF(this.f482b);
            dataOutputStream.writeUTF(this.f483c);
            if (this.f484d != null) {
                dataOutputStream.writeInt(this.f484d.size());
                for (Entry entry : this.f484d.entrySet()) {
                    if (dmVar.m1336b()) {
                        break;
                    }
                    dataOutputStream.writeUTF((String) entry.getKey());
                    ((CacheItem) entry.getValue()).m1100a(dataOutputStream);
                }
            } else {
                dataOutputStream.writeInt(0);
            }
        }
    }

    private synchronized void m904b() {
        if (!(this.f483c == null || this.f484d == null)) {
            da d = m921d(this.f483c);
            if (d == da.PLAYING || d == da.STREAMING || d == da.PAUSED) {
                m915a(this.f483c, da.STOPPED);
            }
        }
    }

    private static String m905c() {
        return eu.m1409c(new File(Environment.getExternalStorageDirectory(), "/Android/data/com.andromo.dev576782.app537736/cache/").getPath());
    }

    private static String m906h(String str) {
        return str != null ? str != null ? str.endsWith(File.separator) ? str.substring(0, str.length() - 1) : str : "" : null;
    }

    private synchronized String m907i(String str) {
        return m909a(str).m1103d();
    }

    private synchronized String m908j(String str) {
        String str2;
        int i = 0;
        synchronized (this) {
            String guessFileName = URLUtil.guessFileName(str, null, null);
            if (guessFileName == null) {
                guessFileName = "download";
            }
            File file = new File(this.f482b + guessFileName);
            str2 = guessFileName;
            while (file.exists()) {
                Object[] objArr = new Object[1];
                int i2 = i + 1;
                objArr[0] = Integer.valueOf(i2);
                String format = String.format(Locale.US, "_%04x", objArr);
                if (guessFileName != null) {
                    int lastIndexOf = guessFileName.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        StringBuilder stringBuilder = new StringBuilder(guessFileName);
                        stringBuilder.insert(lastIndexOf, format);
                        format = stringBuilder.toString();
                    } else {
                        format = guessFileName + format;
                    }
                } else {
                    format = "";
                }
                int i3 = i2;
                file = new File(this.f482b, format);
                str2 = format;
                i = i3;
            }
        }
        return str2;
    }

    public final synchronized CacheItem m909a(String str) {
        CacheItem a;
        String h = m906h(str);
        a = (h == null || this.f484d == null || !this.f484d.containsKey(h)) ? CacheItem.m1095a() : (CacheItem) this.f484d.get(h);
        return a;
    }

    public final synchronized String m910a() {
        return this.f482b != null ? this.f482b : m905c();
    }

    public final synchronized void m911a(Context context, String str, dm dmVar) {
        if (context == null) {
            throw new IllegalArgumentException("Context should not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("Filename should not be null");
        } else {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(context.openFileInput(str)));
            try {
                m901a(dataInputStream, dmVar);
            } finally {
                dataInputStream.close();
            }
        }
    }

    public final void m912a(bv bvVar) {
        this.f485e = bvVar;
    }

    public final synchronized void m913a(String str, int i) {
        String h = m906h(str);
        if (!(h == null || this.f484d == null)) {
            Map map = this.f484d;
            cz czVar = new cz(m909a(h));
            czVar.f819a = i;
            map.put(h, czVar.m1334a());
        }
    }

    public final synchronized void m914a(String str, int i, da daVar) {
        String h = m906h(str);
        if (!(h == null || this.f484d == null)) {
            Map map = this.f484d;
            cz czVar = new cz(m909a(h));
            czVar.f819a = i;
            czVar.f820b = daVar;
            CacheItem cacheItem = (CacheItem) map.put(h, czVar.m1334a());
            if (cacheItem == null || cacheItem.m1101b() != daVar) {
                if (daVar == da.PLAYING || daVar == da.STREAMING) {
                    if (!str.equals(this.f483c)) {
                        m904b();
                    }
                    this.f483c = str;
                }
                if (this.f485e != null) {
                    this.f485e.m1307a(str, daVar);
                }
            }
        }
    }

    public final synchronized void m915a(String str, da daVar) {
        String h = m906h(str);
        if (!(h == null || this.f484d == null)) {
            CacheItem a = m909a(h);
            Object obj = (a == CacheItem.m1095a() || a.m1101b() != daVar) ? 1 : null;
            if (obj != null) {
                Map map = this.f484d;
                cz czVar = new cz(a);
                czVar.f820b = daVar;
                map.put(h, czVar.m1334a());
                if (daVar == da.PLAYING || daVar == da.STREAMING) {
                    if (!str.equals(this.f483c)) {
                        m904b();
                    }
                    this.f483c = str;
                }
                if (this.f485e != null) {
                    this.f485e.m1307a(str, daVar);
                }
            }
        }
    }

    public final synchronized void m916a(String str, String str2) {
        String h = m906h(str);
        if (!(h == null || this.f484d == null)) {
            Map map = this.f484d;
            cz czVar = new cz(m909a(h));
            czVar.f822d = str2;
            map.put(h, czVar.m1334a());
        }
    }

    public final synchronized void m917a(String str, boolean z) {
        String h = m906h(str);
        if (!(h == null || this.f484d == null)) {
            Map map = this.f484d;
            cz czVar = new cz(m909a(h));
            czVar.f821c = z;
            map.put(h, czVar.m1334a());
        }
    }

    public final synchronized void m918b(Context context, String str, dm dmVar) {
        if (context == null) {
            throw new IllegalArgumentException("Context should not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("Filename should not be null");
        } else {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(context.openFileOutput(str, 0)));
            try {
                m903a(dataOutputStream, dmVar);
            } finally {
                dataOutputStream.flush();
                dataOutputStream.close();
            }
        }
    }

    public final synchronized boolean m919b(String str) {
        boolean z;
        String h = m906h(str);
        z = (h == null || this.f484d == null || !this.f484d.containsKey(h)) ? false : true;
        return z;
    }

    public final synchronized boolean m920c(String str) {
        return m909a(str).m1102c();
    }

    public final synchronized da m921d(String str) {
        return m909a(str).m1101b();
    }

    public final int describeContents() {
        return 0;
    }

    public final synchronized String m922e(String str) {
        return this.f482b + m907i(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioCacheMap)) {
            return false;
        }
        AudioCacheMap audioCacheMap = (AudioCacheMap) obj;
        return el.m1392a(this.f482b, audioCacheMap.f482b) && el.m1392a(this.f484d, audioCacheMap.f484d) && el.m1392a(this.f483c, audioCacheMap.f483c);
    }

    public final synchronized String m923f(String str) {
        return "file://" + this.f482b + m907i(str);
    }

    public final synchronized String m924g(String str) {
        return m908j(str);
    }

    public final int hashCode() {
        return ev.m1410a(ev.m1410a(ev.m1410a(23, this.f482b), this.f484d), this.f483c);
    }

    public final synchronized String toString() {
        return "AudioCacheMap { cacheFolder: '" + this.f482b + "', currentFile: '" + this.f483c + "', cacheMap: " + (this.f484d != null ? this.f484d.toString() : "null") + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f482b);
        parcel.writeString(this.f483c);
        fh.m1435a(this.f484d, parcel);
    }
}
