package com.andromo.dev576782.app537736;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hf {
    long f1022a;
    String f1023b;
    String f1024c;
    String f1025d;
    hd f1026e;
    hc f1027f;
    he f1028g;
    int f1029h;
    List f1030i;
    List f1031j;
    hg f1032k;

    public hf() {
        this.f1026e = hd.SEQUENTIAL;
        this.f1027f = hc.AUTOMATIC;
        this.f1028g = he.OFF;
        this.f1029h = -1;
        this.f1032k = hg.PENDING;
    }

    public hf(Playlist playlist) {
        this.f1026e = hd.SEQUENTIAL;
        this.f1027f = hc.AUTOMATIC;
        this.f1028g = he.OFF;
        this.f1029h = -1;
        this.f1032k = hg.PENDING;
        if (playlist != null) {
            this.f1022a = playlist.f587e;
            this.f1023b = playlist.f586d;
            this.f1024c = playlist.f588f;
            this.f1025d = playlist.f589g;
            this.f1026e = playlist.f590h;
            this.f1027f = playlist.f591i;
            this.f1028g = playlist.f592j;
            this.f1029h = playlist.f593k;
            if (playlist.f585c != null) {
                this.f1030i = new ArrayList(playlist.f585c);
            }
            if (playlist.f584b != null) {
                this.f1031j = new ArrayList(playlist.f584b);
            }
        }
    }

    private synchronized void m1554a(DataInputStream dataInputStream) {
        if (dataInputStream != null) {
            if (this.f1032k != hg.CANCELLED) {
                int readInt = dataInputStream.readInt();
                if (readInt < 2) {
                    throw new IOException("Playlist file version " + readInt + " is older than 2");
                }
                this.f1022a = dataInputStream.readLong();
                this.f1023b = dataInputStream.readUTF();
                this.f1024c = dataInputStream.readUTF();
                this.f1025d = dataInputStream.readUTF();
                this.f1026e = hd.valueOf(dataInputStream.readUTF());
                this.f1027f = hc.valueOf(dataInputStream.readUTF());
                this.f1028g = he.valueOf(dataInputStream.readUTF());
                this.f1029h = dataInputStream.readInt();
                if (this.f1032k != hg.CANCELLED) {
                    readInt = dataInputStream.readInt();
                    if (readInt != -1) {
                        this.f1030i = new ArrayList(readInt);
                        while (readInt > 0) {
                            if (this.f1032k == hg.CANCELLED) {
                                break;
                            }
                            this.f1030i.add(Integer.valueOf(dataInputStream.readInt()));
                            readInt--;
                        }
                    } else {
                        this.f1030i = null;
                    }
                    readInt = dataInputStream.readInt();
                    if (readInt == -1) {
                        this.f1031j = Collections.emptyList();
                    } else {
                        this.f1031j = new ArrayList(readInt);
                        while (readInt > 0 && this.f1032k != hg.CANCELLED) {
                            AudioItem a = AudioItem.m969a(dataInputStream);
                            if (a != AudioItem.m968a()) {
                                this.f1031j.add(a);
                            }
                            readInt--;
                        }
                    }
                }
            }
        }
    }

    public final hf m1555a(Context context, String str) {
        IOException e;
        FileNotFoundException e2;
        Throwable th;
        this.f1032k = hg.RUNNING;
        DataInputStream dataInputStream = null;
        DataInputStream dataInputStream2;
        try {
            dataInputStream2 = new DataInputStream(new BufferedInputStream(context.openFileInput(str)));
            try {
                m1554a(dataInputStream2);
                this.f1032k = hg.DONE;
                try {
                    dataInputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return this;
            } catch (FileNotFoundException e4) {
                e2 = e4;
                try {
                    this.f1032k = hg.ERROR;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e3 = e6;
                dataInputStream = dataInputStream2;
                try {
                    this.f1032k = hg.ERROR;
                    throw e3;
                } catch (Throwable th3) {
                    th = th3;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e7) {
            e2 = e7;
            dataInputStream2 = null;
            this.f1032k = hg.ERROR;
            throw e2;
        } catch (IOException e8) {
            e3 = e8;
            this.f1032k = hg.ERROR;
            throw e3;
        }
    }

    final synchronized void m1556a(DataOutputStream dataOutputStream) {
        if (dataOutputStream != null) {
            if (!(this.f1032k == hg.CANCELLED || this.f1032k == hg.ERROR)) {
                Object obj;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeLong(this.f1022a);
                dataOutputStream.writeUTF(this.f1023b);
                dataOutputStream.writeUTF(this.f1024c);
                dataOutputStream.writeUTF(this.f1025d);
                dataOutputStream.writeUTF(this.f1026e.name());
                dataOutputStream.writeUTF(this.f1027f.name());
                dataOutputStream.writeUTF(this.f1028g.name());
                dataOutputStream.writeInt(this.f1029h);
                if (this.f1030i == null || this.f1030i.size() == 0) {
                    dataOutputStream.writeInt(-1);
                } else {
                    int size = this.f1030i.size();
                    dataOutputStream.writeInt(size);
                    for (int i = 0; i < size; i++) {
                        dataOutputStream.writeInt(((Integer) this.f1030i.get(i)).intValue());
                    }
                }
                List<AudioItem> list = this.f1031j;
                if (list != null) {
                    for (AudioItem e : list) {
                        if (e.m988e().m1315a()) {
                            obj = 1;
                            break;
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    dataOutputStream.writeInt(this.f1031j.size());
                    for (AudioItem e2 : this.f1031j) {
                        e2.m983a(dataOutputStream);
                    }
                } else {
                    dataOutputStream.writeInt(-1);
                }
            }
        }
    }

    final boolean m1557a() {
        return this.f1032k == hg.CANCELLED;
    }
}
