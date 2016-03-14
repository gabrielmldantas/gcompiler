/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AParam extends PParam
{
    private PTypeSpec _typeSpec_;
    private TId _id_;

    public AParam()
    {
        // Constructor
    }

    public AParam(
        @SuppressWarnings("hiding") PTypeSpec _typeSpec_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setTypeSpec(_typeSpec_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new AParam(
            cloneNode(this._typeSpec_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParam(this);
    }

    public PTypeSpec getTypeSpec()
    {
        return this._typeSpec_;
    }

    public void setTypeSpec(PTypeSpec node)
    {
        if(this._typeSpec_ != null)
        {
            this._typeSpec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeSpec_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._typeSpec_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._typeSpec_ == child)
        {
            this._typeSpec_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._typeSpec_ == oldChild)
        {
            setTypeSpec((PTypeSpec) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
