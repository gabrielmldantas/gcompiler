/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class TBlkComment extends Token
{
    public TBlkComment(String text)
    {
        setText(text);
    }

    public TBlkComment(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBlkComment(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBlkComment(this);
    }
}
