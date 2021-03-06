/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleVarDecl extends PVarDecl
{
    private PTypeSpec _typeSpec_;
    private TId _id_;
    private TSemi _semi_;

    public ASimpleVarDecl()
    {
        // Constructor
    }

    public ASimpleVarDecl(
        @SuppressWarnings("hiding") PTypeSpec _typeSpec_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setTypeSpec(_typeSpec_);

        setId(_id_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleVarDecl(
            cloneNode(this._typeSpec_),
            cloneNode(this._id_),
            cloneNode(this._semi_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleVarDecl(this);
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

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._typeSpec_)
            + toString(this._id_)
            + toString(this._semi_);
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

        if(this._semi_ == child)
        {
            this._semi_ = null;
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

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
