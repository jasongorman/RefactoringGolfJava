import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {
	
	private Map<String, Object[]> titles = new HashMap<String, Object[]>();

	public Map<String, Object[]> getTitles() {
		return titles;
	}

	public void donate(String titleName, String donorMembershipId) {
		titles.put(titleName, new Object[]{titleName, donorMembershipId, 1});
	}

	public Collection<Object[]> getTitlesDonatedByMember(String donorMembershipId) {
		Collection<Object[]> allTitles = titles.values();
		List<Object[]> memberTitles = new ArrayList<Object[]>();
		for (Object[] title : allTitles) {
			if(title[1].equals(donorMembershipId)){
				memberTitles.add(title);
			}
		}
		return memberTitles;
	}

}
