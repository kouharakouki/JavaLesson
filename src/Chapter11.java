
public class Chapter11 {

	public static void main(String[] args) {

		KyotoCleaningShop kcs = new KyotoCleaningShop();
		kcs.address = "住所";
		kcs.ownerName ="オーナー";
		kcs.phone = "携帯電話";

		Shirt sh = new Shirt();

		kcs.washShirt(sh);
	}

}
