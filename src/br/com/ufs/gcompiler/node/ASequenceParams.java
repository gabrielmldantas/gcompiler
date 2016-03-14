/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class ASequenceParams extends PParams
{
    private PParams _params_;
    private TComma _comma_;
    private PParam _param_;

    public ASequenceParams()
    {
        // Constructor
    }

    public ASequenceParams(
        @SuppressWarnings("hiding") PParams _params_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PParam _param_)
    {
        // Constructor
        setParams(_params_);

        setComma(_comma_);

        setParam(_param_);

    }

    @Override
    public Object clone()
    {
        return new ASequenceParams(
            cloneNode(this._params_),
            cloneNode(this._comma_),
            cloneNode(this._param_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASequenceParams(this);
    }

    public PParams getParams()
    {
        return this._params_;
    }

    public void setParams(PParams node)
    {
        if(this._params_ != null)
        {
            this._params_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._params_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
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
            + toString(this._params_)
            + toString(this._comma_)
            + toString(this._param_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._params_ == child)
        {
            this._params_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

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
        if(this._params_ == oldChild)
        {
            setParams((PParams) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._param_ == oldChild)
        {
            setParam((PParam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
