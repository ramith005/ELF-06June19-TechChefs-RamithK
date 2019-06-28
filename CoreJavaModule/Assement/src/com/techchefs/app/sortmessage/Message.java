package com.techchefs.app.sortmessage;
import lombok.extern.java.Log;

/**
 * 
 * @author Ramith
 * WAP to sort the message based on the date and time.
 */
@Log
public class Message {
	
	private String msg;
	private String msgTime;
	
	public Message() {
		
	}
	public Message(String msg, String msgTime) {
		this.msg = msg;
		this.msgTime = msgTime;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsgTime() {
		return msgTime;
	}
	
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}
	
	
}
