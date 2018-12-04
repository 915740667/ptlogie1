package com.ptlogie.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SessionListener implements HttpSessionListener {
	private final Log logger = LogFactory.getLog(SessionListener.class);
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session=se.getSession();
		// TODO Auto-generated method stub
		logger.debug(session);
		logger.debug("listener start");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSession session=se.getSession();
		// TODO Auto-generated method stub
		logger.debug(session);
		
		logger.debug("listener destory");
	}

}
