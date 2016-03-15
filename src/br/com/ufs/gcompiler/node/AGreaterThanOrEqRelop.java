/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AGreaterThanOrEqRelop extends PRelop
{
    private TGreaterThanOrEq _greaterThanOrEq_;

    public AGreaterThanOrEqRelop()
    {
        // Constructor
    }

    public AGreaterThanOrEqRelop(
        @SuppressWarnings("hiding") TGreaterThanOrEq _greaterThanOrEq_)
    {
        // Constructor
        setGreaterThanOrEq(_greaterThanOrEq_);

    }

    @Override
    public Object clone()
    {
        return new AGreaterThanOrEqRelop(
            cloneNode(this._greaterThanOrEq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterThanOrEqRelop(this);
    }

    public TGreaterThanOrEq getGreaterThanOrEq()
    {
        return this._greaterThanOrEq_;
    }

    public void setGreaterThanOrEq(TGreaterThanOrEq node)
    {
        if(this._greaterThanOrEq_ != null)
        {
            this._greaterThanOrEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greaterThanOrEq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._greaterThanOrEq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._greaterThanOrEq_ == child)
        {
            this._greaterThanOrEq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._greaterThanOrEq_ == oldChild)
        {
            setGreaterThanOrEq((TGreaterThanOrEq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
