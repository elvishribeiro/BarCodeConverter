package principal;

public enum EncodeType {
	EAN (13){
		@Override
		public NumericCode getEncodeType() {
			return new EAN();
		}
	},
	UPC (12){
		@Override
		public NumericCode getEncodeType() {
			return new UPC();
		}
	};
	
	private final int value;
	
	EncodeType (int value) {
		this.value = value;
	}
	
	int getValue() {
		return value;
	}
	
	public abstract NumericCode getEncodeType();
}
