public abstract class Sports {

	public abstract void initialize();

	public abstract void startPlay();

	public abstract void endPlay();

	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}

}


