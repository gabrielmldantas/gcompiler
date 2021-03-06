/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class ASingleParamList extends PParamList
{
    private PParam _param_;

    public ASingleParamList()
    {
        // Constructor
    }

    public ASingleParamList(
        @SuppressWarnings("hiding") PParam _param_)
    {
        // Constructor
        setParam(_param_);

    }

    @Override
    public Object clone()
    {
        return new ASingleParamList(
            cloneNode(this._param_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleParamList(this);
    }

    public PParam getParam()
    {
        return this._param_;
    }

    public void setParam(PParam node)
    {
        if(this._param_ != null)
        {
            this._param_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._param_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._param_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._param_ == child)
        {
            this._param_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._param_ == oldChild)
        {
            setParam((PParam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
