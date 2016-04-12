import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {
	
	private Map<String, Title> titles = new HashMap<String, Title>();

	public Map<String, Title> getTitles() {
		return titles;
	}

	public void donate(Title title) {
		titles.put(title.getTitleName(), title);
	}

	public Collection<Title> getTitlesDonatedByMember(String donorMembershipId) {
		List<Title> memberTitles = new ArrayList<Title>();
		for (Title title : titles.values()) {
			if(title.getDonorId().equals(donorMembershipId)){
				memberTitles.add(title);
			}
		}
		return memberTitles;
	}

}
