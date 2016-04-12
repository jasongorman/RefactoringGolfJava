public class Title {

	
	private String name;
	private int copyCount = 1;
	private Member donor;

	public Title(String name, Member donor) {
		this.name = name;
		this.donor = donor;
	}

	protected int getCopyCount() {
		return copyCount;
	}

	protected String getDonorId() {
		return donor.getId();
	}

	protected String getTitleName() {
		return name;
	}

}