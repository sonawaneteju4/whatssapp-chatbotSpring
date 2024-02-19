package com.whatsappbot.app.bean;

import java.util.List;

public class WhatsAppEntry {
    private List<WhatsAppChange> changes;

	@Override
	public String toString() {
		return "WhatsAppEntry [changes=" + changes + "]";
	}

	public List<WhatsAppChange> getChanges() {
		return changes;
	}

	public void setChanges(List<WhatsAppChange> changes) {
		this.changes = changes;
	}

	public WhatsAppEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

}
