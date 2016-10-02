package com.andromo.dev576782.app537736;

import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.andromo.dev576782.app537736.t */
final class C0218t implements Runnable {
    final /* synthetic */ C0211m f1217a;

    private C0218t(C0211m c0211m) {
        this.f1217a = c0211m;
    }

    public final void run() {
        synchronized (this.f1217a.f1194d) {
            List arrayList = new ArrayList(this.f1217a.f1196f);
        }
        try {
            OutputStream openFileOutput = this.f1217a.f1197g.openFileOutput(this.f1217a.f1198h, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
                newSerializer.startTag(null, "historical-records");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0215q c0215q = (C0215q) arrayList.remove(0);
                    newSerializer.startTag(null, "historical-record");
                    newSerializer.attribute(null, "activity", c0215q.f1212a.flattenToString());
                    newSerializer.attribute(null, "time", String.valueOf(c0215q.f1213b));
                    newSerializer.attribute(null, "weight", String.valueOf(c0215q.f1214c));
                    newSerializer.endTag(null, "historical-record");
                }
                newSerializer.endTag(null, "historical-records");
                newSerializer.endDocument();
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IllegalArgumentException e2) {
                C0211m.f1190a;
                "Error writing historical recrod file: " + this.f1217a.f1198h;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (IllegalStateException e4) {
                C0211m.f1190a;
                "Error writing historical recrod file: " + this.f1217a.f1198h;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (IOException e6) {
                C0211m.f1190a;
                "Error writing historical recrod file: " + this.f1217a.f1198h;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e7) {
                    }
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e8) {
                    }
                }
            }
        } catch (FileNotFoundException e9) {
            C0211m.f1190a;
            "Error writing historical recrod file: " + this.f1217a.f1198h;
        }
    }
}
