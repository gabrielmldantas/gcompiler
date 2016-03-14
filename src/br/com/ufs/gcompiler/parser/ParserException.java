/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.parser;

import br.com.ufs.gcompiler.node.*;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    private Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}
