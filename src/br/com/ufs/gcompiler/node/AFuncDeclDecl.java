/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AFuncDeclDecl extends PDecl
{
    private PFuncDecl _funcDecl_;

    public AFuncDeclDecl()
    {
        // Constructor
    }

    public AFuncDeclDecl(
        @SuppressWarnings("hiding") PFuncDecl _funcDecl_)
    {
        // Constructor
        setFuncDecl(_funcDecl_);

    }

    @Override
    public Object clone()
    {
        return new AFuncDeclDecl(
            cloneNode(this._funcDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFuncDeclDecl(this);
    }

    public PFuncDecl getFuncDecl()
    {
        return this._funcDecl_;
    }

    public void setFuncDecl(PFuncDecl node)
    {
        if(this._funcDecl_ != null)
        {
            this._funcDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcDecl_ == child)
        {
            this._funcDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcDecl_ == oldChild)
        {
            setFuncDecl((PFuncDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}