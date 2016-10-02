package com.andromo.dev576782.app537736;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class bs extends BaseAdapter {
    private LayoutInflater f762a;
    private Playlist f763b;
    private final int f764c;
    private boolean f765d;
    private String f766e;

    public bs(Context context, Playlist playlist) {
        this.f762a = LayoutInflater.from(context);
        this.f763b = playlist;
        this.f764c = 2130903069;
        this.f766e = context.getResources().getString(2131230971);
    }

    public final void m1306a(Playlist playlist) {
        this.f763b = playlist;
        notifyDataSetChanged();
    }

    public final int getCount() {
        return this.f763b != null ? this.f763b.m1151c() : 0;
    }

    public final Object getItem(int i) {
        return this.f763b != null ? this.f763b.m1148b(i) : null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        bt btVar = null;
        if (view == null) {
            view = this.f762a.inflate(this.f764c, viewGroup, false);
            if (view != null) {
                bt btVar2 = new bt();
                btVar2.f767a = (TextView) view.findViewById(2131361898);
                btVar2.f768b = (TextView) view.findViewById(2131361899);
                btVar2.f769c = (ImageView) view.findViewById(2131361957);
                view.setTag(btVar2);
                btVar = btVar2;
            }
        } else {
            btVar = (bt) view.getTag();
        }
        if (!(this.f763b == null || btVar == null)) {
            AudioItem b = this.f763b.m1148b(i);
            if (b != null) {
                if (btVar.f767a != null) {
                    CharSequence c = b.m986c();
                    if (c != null && c.length() > 0) {
                        btVar.f767a.setText(c);
                    } else if (getCount() > 1) {
                        btVar.f767a.setText(String.format(this.f766e != null ? this.f766e : "Track %d", new Object[]{Integer.valueOf(i + 1)}));
                    } else {
                        btVar.f767a.setText(2131230972);
                    }
                }
                if (btVar.f768b != null) {
                    if (this.f765d) {
                        if (b.m987d() == null || b.m987d().length() <= 0) {
                            btVar.f768b.setText("");
                            btVar.f768b.setVisibility(8);
                        } else {
                            btVar.f768b.setText(Html.fromHtml(b.m987d()).toString());
                            btVar.f768b.setVisibility(0);
                        }
                    } else if (b.m987d() == null || b.m987d().length() <= 0) {
                        btVar.f768b.setText("");
                        btVar.f768b.setVisibility(8);
                    } else {
                        btVar.f768b.setText(b.m987d());
                        btVar.f768b.setVisibility(0);
                    }
                }
                if (btVar.f769c != null) {
                    if (this.f763b.m1155d(i)) {
                        if (this.f763b.m1160h() == ct.Stopped) {
                            btVar.f769c.setImageResource(2130837734);
                        } else if (this.f763b.m1160h() == ct.Paused) {
                            btVar.f769c.setImageResource(2130837735);
                        } else {
                            btVar.f769c.setImageResource(2130837736);
                        }
                        btVar.f769c.setVisibility(0);
                    } else {
                        btVar.f769c.setVisibility(4);
                    }
                }
            } else {
                if (btVar.f767a != null) {
                    btVar.f767a.setText("Error: item " + i + " is null");
                }
                if (btVar.f768b != null) {
                    btVar.f768b.setText("");
                }
            }
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
