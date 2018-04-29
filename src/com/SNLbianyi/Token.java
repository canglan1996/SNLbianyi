package com.SNLbianyi;

import java.util.ArrayList;

public class Token implements java.io.Serializable {
	int Lineshow;
	LexTpye Lex;
	String Sem;
	public Token(){}
	public Token(LexTpye Lex,String Sem,int Line){
		this.Lex=Lex;
		this.Sem=Sem;
		this.Lineshow=Line;	
	}
	public String toString(){
		switch(Lex){
		case ID:		return "Lex:id Sem:"+Sem+" line:"+Lineshow;
		case PROGRAM:	return "Lex:program line:"+Lineshow;
		case BEGIN:		return "Lex:begin line:"+Lineshow;
		case END:		return "Lex:end line:"+Lineshow;
		case VAR:		return "Lex:var line:"+Lineshow;
		case INTEGER:	return "Lex:integer line:"+Lineshow;
		case CHAR:		return "Lex:char line:"+Lineshow;
		case ARRAY:		return "Lex:array line:"+Lineshow;
		case PROCEDURE:	return "Lex:procedure line:"+Lineshow;
		case RETURN:	return "Lex:return line:"+Lineshow;
		case WHILE:		return "Lex:while line:"+Lineshow;
		case DO:		return "Lex:do line:"+Lineshow;
		case ENDWH:		return "Lex:endwh line:"+Lineshow;
		case IF:		return "Lex:if line:"+Lineshow;
		case THEN:		return "Lex:then line:"+Lineshow;
		case ELSE:		return "Lex:else line:"+Lineshow;
		case FI:		return "Lex:fi line:"+Lineshow;
		case READ:		return "Lex:read line:"+Lineshow;
		case WRITE:		return "Lex:write line:"+Lineshow;
		case OF:		return "Lex:of line:"+Lineshow;
		case ADD:		return "Lex:+ line:"+Lineshow;
		case SUB:		return "Lex:- line:"+Lineshow;
		case MUL:		return "Lex:* line:"+Lineshow;
		case DIV:		return "Lex:/ line:"+Lineshow;
		case LESS:		return "Lex:< line:"+Lineshow;
		case EQU:		return "Lex:= line:"+Lineshow;
		case LCB:		return "Lex:( line:"+Lineshow;
		case RCB:		return "Lex:) line:"+Lineshow;
		case LSB:		return "Lex:[ line:"+Lineshow;
		case RSB:		return "Lex:] line:"+Lineshow;
		case POINT:		return "Lex:. line:"+Lineshow;
		case SEM:		return "Lex:; line:"+Lineshow;
		case EOF:		return "Lex:EOF line:"+Lineshow;
		case SPACE:		return "Lex:  line:"+Lineshow;
		case MOV:		return "Lex::= line:"+Lineshow;
		case LFB:		return "Lex:{ line:"+Lineshow;
		case RFB:		return "Lex:} line:"+Lineshow;
		case QUO:		return "Lex:' line:"+Lineshow;
		case DPO:		return "Lex:.. line:"+Lineshow; 
		default: 		return "error: 未知的字符串 line:+Lineshow";
		}
	}
}
enum LexTpye implements java.io.Serializable{
	//标识符
	ID,
	//保留字
	PROGRAM, BEGIN, END, VAR, INTEGER, CHAR, ARRAY, PROCEDURE,
	RETURN, WHILE, DO, ENDWH, IF, THEN, ELSE, FI, READ, WRITE, OF,
	//无符号整数
	INTC,
	//单字符分界符
	ADD/* + */,SUB/* - */,MUL/* * */,DIV/* - */,LESS/* - */,EQU/* = */,
	LCB/* ( */,RCB/* ) */,LSB/* [ */,RSB/* ] */,POINT/* . */,SEM/* ; */,
	EOF/* EOF */,SPACE/*   */,
	//双字符分界符
	MOV/* := */,
	//注释头符
	LFB/* { */,
	//注释结束符
	RFB/* } */,
	//字符起始和结束符
	QUO/* ' */,
	//数组下界限符
	DPO/* .. */
	}