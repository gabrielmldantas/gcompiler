/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AOtherStmtMatchedStmt extends PMatchedStmt
{
    private POtherStmt _otherStmt_;

    public AOtherStmtMatchedStmt()
    {
        // Constructor
    }

    public AOtherStmtMatchedStmt(
        @SuppressWarnings("hiding") POtherStmt _otherStmt_)
    {
        // Constructor
        setOtherStmt(_otherStmt_);

    }

    @Override
    public Object clone()
    {
        return new AOtherStmtMatchedStmt(
            cloneNode(this._otherStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOtherStmtMatchedStmt(this);
    }

    public POtherStmt getOtherStmt()
    {
        return this._otherStmt_;
    }

    public void setOtherStmt(POtherStmt node)
    {
        if(this._otherStmt_ != null)
        {
            this._otherStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._otherStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._otherStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._otherStmt_ == child)
        {
            this._otherStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._otherStmt_ == oldChild)
        {
            setOtherStmt((POtherStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
