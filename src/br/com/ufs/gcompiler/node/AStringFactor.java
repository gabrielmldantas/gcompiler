/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AStringFactor extends PFactor
{
    private TStringLiteral _stringLiteral_;

    public AStringFactor()
    {
        // Constructor
    }

    public AStringFactor(
        @SuppressWarnings("hiding") TStringLiteral _stringLiteral_)
    {
        // Constructor
        setStringLiteral(_stringLiteral_);

    }

    @Override
    public Object clone()
    {
        return new AStringFactor(
            cloneNode(this._stringLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringFactor(this);
    }

    public TStringLiteral getStringLiteral()
    {
        return this._stringLiteral_;
    }

    public void setStringLiteral(TStringLiteral node)
    {
        if(this._stringLiteral_ != null)
        {
            this._stringLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stringLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stringLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stringLiteral_ == child)
        {
            this._stringLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stringLiteral_ == oldChild)
        {
            setStringLiteral((TStringLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
