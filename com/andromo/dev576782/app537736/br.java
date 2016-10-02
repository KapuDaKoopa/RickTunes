package com.andromo.dev576782.app537736;

import android.os.AsyncTask;
import android.os.Environment;
import android.widget.BaseAdapter;

final class br extends AsyncTask {
    final /* synthetic */ Audio98819 f761a;

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z = false;
        if (this.f761a.f456h != null && this.f761a.f473y != null) {
            String externalStorageState = Environment.getExternalStorageState();
            boolean z2 = "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
            boolean a = eu.m1405a();
            boolean z3;
            int i;
            if (this.f761a.f470v != null) {
                boolean b = this.f761a.f456h.m1150b(this.f761a.f470v.m1087t());
                AudioItem z4 = b ? this.f761a.f470v.m1093z() : AudioItem.m968a();
                int c = this.f761a.f456h.m1151c();
                z3 = false;
                for (i = 0; i < c && !isCancelled(); i++) {
                    AudioItem b2 = this.f761a.f456h.m1148b(i);
                    if (b2 != null) {
                        String b3 = b2.m985b();
                        boolean a2 = b2.m984a(z4);
                        if (this.f761a.f473y.m952b(b3)) {
                            CacheItem a3 = this.f761a.f473y.m939a(b3);
                            if (a3.m1102c()) {
                                boolean z5 = z2 && Audio98819.m812a(this.f761a, b3);
                                if (!z5) {
                                    this.f761a.f473y.m947a(b3, false);
                                    z3 = true;
                                }
                            }
                            da b4 = a3.m1101b();
                            if (a && b4 == da.QUEUED) {
                                if (b2.m995l() && !b2.m988e().m1316b()) {
                                    this.f761a.f473y.m948a(b2.m985b(), false, false);
                                }
                            } else if ((b4 == da.PLAYING || b4 == da.STREAMING) && !(b && a2)) {
                                this.f761a.f473y.m944a(b3, da.STOPPED);
                                z3 = true;
                            }
                        }
                        if (b && a2) {
                            if (this.f761a.f470v.m1043B()) {
                                if (this.f761a.f470v.m1047F()) {
                                    this.f761a.f473y.m944a(b3, da.STREAMING);
                                    z3 = true;
                                } else {
                                    this.f761a.f473y.m944a(b3, da.PLAYING);
                                    z3 = true;
                                }
                            } else if (this.f761a.f470v.m1044C()) {
                                this.f761a.f473y.m944a(b3, da.PAUSED);
                                z3 = true;
                            }
                        }
                    }
                }
                z = z3;
            } else {
                i = this.f761a.f456h.m1151c();
                boolean z6 = false;
                for (int i2 = 0; i2 < i && !isCancelled(); i2++) {
                    AudioItem b5 = this.f761a.f456h.m1148b(i2);
                    if (b5 != null) {
                        String b6 = b5.m985b();
                        if (this.f761a.f473y.m952b(b6) && this.f761a.f473y.m939a(b6).m1102c()) {
                            z3 = z2 && Audio98819.m812a(this.f761a, b6);
                            if (!z3) {
                                this.f761a.f473y.m947a(b6, false);
                                z6 = true;
                            }
                        }
                    }
                }
                z = z6;
            }
        } else if (this.f761a.f456h != null) {
            this.f761a.f473y;
        }
        return new Boolean(z);
    }

    protected final void onCancelled() {
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!isCancelled() && bool.booleanValue()) {
            BaseAdapter baseAdapter = (BaseAdapter) this.f761a.getListAdapter();
            if (baseAdapter != null) {
                baseAdapter.notifyDataSetChanged();
            }
        }
    }
}
