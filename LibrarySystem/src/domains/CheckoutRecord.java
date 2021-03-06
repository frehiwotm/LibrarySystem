package domains;

import java.util.List;

public class CheckoutRecord {
	
	private List<CheckoutRecordEntry> entries;
	
	public CheckoutRecord(CheckoutRecordEntry entry) {
		addEntry(entry);
	}

	public List<CheckoutRecordEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<CheckoutRecordEntry> entries) {
		this.entries = entries;
	}

	public void addEntry(CheckoutRecordEntry entry) {
		this.entries.add(entry);
		
	}
	
	public void addallEntries(List<CheckoutRecordEntry> entries) {
		
		this.entries.addAll(entries);
		
	}
}
