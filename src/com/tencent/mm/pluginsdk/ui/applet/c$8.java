package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.base.o;

final class c$8
  implements View.OnClickListener
{
  c$8(c.a parama, View paramView, o paramo) {}
  
  public final void onClick(View paramView)
  {
    if (jfd != null) {
      jfd.a(true, c.ak(clo), c.al(clo));
    }
    jfe.dismiss();
    jfe.setFocusable(false);
    jfe.setTouchable(false);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.c.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */