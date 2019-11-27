class Animal {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int value) {
		size = value;
	}
	
	public String panic() {
		return "blya " + makeNoise();
	}

    public String makeNoise() {
        return "default";
    }
}
