package com.tencent.mm.pluginsdk.ui.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b$a
{
  List<String> hKe = new ArrayList();
  
  final String aXF()
  {
    if ((hKe == null) || (hKe.size() == 0)) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = hKe.iterator();
    while (localIterator.hasNext())
    {
      localStringBuffer.append((String)localIterator.next());
      localStringBuffer.append(";");
    }
    return localStringBuffer.toString();
  }
  
  final void up(String paramString)
  {
    hKe = new ArrayList();
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      paramString = paramString.split(";");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramString[i];
        hKe.add(localObject);
        i += 1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */