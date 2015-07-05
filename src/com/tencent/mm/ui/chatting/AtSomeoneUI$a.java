package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.a.f;
import com.tencent.mm.a.i;
import com.tencent.mm.a.k;
import com.tencent.mm.ao.a;
import com.tencent.mm.model.ap.a;
import com.tencent.mm.model.ap.d;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.b;
import com.tencent.mm.model.w;
import com.tencent.mm.platformtools.ad;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.i;
import com.tencent.mm.sdk.g.af;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.cj;
import java.util.ArrayList;
import java.util.List;

final class AtSomeoneUI$a
  extends cj
{
  private e cCQ;
  private List ceC;
  String dkz;
  private String[] iSj;
  
  public AtSomeoneUI$a(Context paramContext, com.tencent.mm.storage.k paramk, e parame, String[] paramArrayOfString, List paramList)
  {
    super(paramContext, paramk);
    cCQ = parame;
    iSj = paramArrayOfString;
    ceC = paramList;
  }
  
  public final void Eb()
  {
    q localq = ax.tl().ri();
    String[] arrayOfString1 = iSj;
    String str1 = dkz;
    String str2 = dkz;
    Object localObject1;
    if ((cCQ == null) || (str2 == null) || (iSj == null))
    {
      localObject1 = null;
      localObject2 = ceC;
      localObject1 = "select * ,rowid from rcontact " + q.e("@all.chatroom", str1, (List)localObject2) + q.w(arrayOfString1) + q.m(str1, (List)localObject1) + q.aGw();
      setCursor(aqT.rawQuery((String)localObject1, null));
      super.notifyDataSetChanged();
      return;
    }
    Object localObject2 = new ArrayList();
    String[] arrayOfString2 = iSj;
    int j = arrayOfString2.length;
    int i = 0;
    for (;;)
    {
      localObject1 = localObject2;
      if (i >= j) {
        break;
      }
      localObject1 = arrayOfString2[i];
      String str3 = cCQ.dN((String)localObject1);
      if ((str3 != null) && (str3.contains(str2))) {
        ((ArrayList)localObject2).add(localObject1);
      }
      i += 1;
    }
  }
  
  protected final void Ec()
  {
    closeCursor();
    Eb();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    com.tencent.mm.storage.k localk;
    Object localObject;
    if (paramView == null)
    {
      localView = View.inflate(context, a.k.at_someone_item, null);
      paramViewGroup = new AtSomeoneUI.b((byte)0);
      iSk = ((MaskLayout)localView.findViewById(a.i.at_someone_item_avatar));
      ciK = ((TextView)localView.findViewById(a.i.at_someone_item_nick));
      localView.setTag(paramViewGroup);
      localk = (com.tencent.mm.storage.k)getItem(paramInt);
      paramView = ciK;
      localObject = context;
      if (w.ew(field_username)) {
        break label248;
      }
      paramInt = a.f.mm_list_textcolor_one;
      label98:
      paramView.setTextColor(a.t((Context)localObject, paramInt));
      a.b.b((ImageView)iSk.getContentView(), field_username);
      if (field_verifyFlag == 0) {
        break label277;
      }
      if (ap.a.boC == null) {
        break label266;
      }
      paramView = ap.a.boC.cz(field_verifyFlag);
      if (paramView == null) {
        break label255;
      }
      paramView = com.tencent.mm.s.k.gk(paramView);
      iSk.d(paramView, MaskLayout.a.iJo);
      label174:
      if (ad.iW(field_conRemark)) {
        break label288;
      }
    }
    label248:
    label255:
    label266:
    label277:
    label288:
    for (paramView = field_conRemark;; paramView = AtSomeoneUI.a(cCQ, field_username))
    {
      localObject = paramView;
      if (ad.iW(paramView)) {
        localObject = localk.qC();
      }
      ciK.setText(i.a(context, (CharSequence)localObject, ciK.getTextSize()));
      return localView;
      paramViewGroup = (AtSomeoneUI.b)paramView.getTag();
      localView = paramView;
      break;
      paramInt = a.f.mm_list_textcolor_spuser;
      break label98;
      iSk.setMaskDrawable(null);
      break label174;
      iSk.setMaskDrawable(null);
      break label174;
      iSk.setMaskDrawable(null);
      break label174;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.chatting.AtSomeoneUI.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */