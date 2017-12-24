package structure.template_method;

import util.Utils;

public abstract class TemplateMethod {

	public void flow() {

		init();

		try {
			main();

		} catch (Exception e) {

		}

		fin();

	}

	protected void init() {
		Utils.whoDidIt();
	}

	protected abstract void main();

	protected void fin() {
		Utils.whoDidIt();
	}

}
