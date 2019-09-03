package eangenerators;

public enum Digits {
	ZERO {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Zero(digits);
		}
	},
	ONE {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new One(digits);
		}
	},
	TWO {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Two(digits);
		}
	},
	THREE {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Three(digits);
		}
	},
	FOUR {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Four(digits);
		}
	},
	FIVE {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Five(digits);
		}
	},
	SIX {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Six(digits);
		}
	},
	SEVEN {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Seven(digits);
		}
	},
	EIGHT {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Eight(digits);
		}
	},
	NINE {
		@Override
		public EanGeneratorType getEanGeneratorType(String digits) {
			return new Nine(digits);
		}
	};
	
	public abstract EanGeneratorType getEanGeneratorType(String digits);
}
