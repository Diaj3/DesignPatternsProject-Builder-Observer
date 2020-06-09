package builderPattern;

public class Figurine {
	private String eyes, head, body, hair, clothes, accessories;

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public void setClothes(String clothes) {
		this.clothes = clothes;
	}

	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}
	
	@Override
	public String toString() {
		return "(eyes: " + eyes + ", head: " + head + ", body: " + body + ", hair: " + hair + ", clothes: "
				+ clothes + ", accessories: " + accessories + ")";
	}
}
