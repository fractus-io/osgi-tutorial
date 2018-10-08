package io.fractus.osgi.tutorial.bundle.listener;

import org.osgi.framework.BundleEvent;

public class Util {

	public static String typeAsString(BundleEvent event) {
		if (event == null) {
			return "null";
		}
		int type = event.getType();

		switch (type) {
			case BundleEvent.INSTALLED:
				return "INSTALLED";
			case BundleEvent.LAZY_ACTIVATION:
				return "LAZY_ACTIVATION";
			case BundleEvent.RESOLVED:
				return "RESOLVED";
			case BundleEvent.STARTED:
				return "STARTED";
			case BundleEvent.STARTING:
				return "Starting";
			case BundleEvent.STOPPED:
				return "STOPPED";
			case BundleEvent.UNINSTALLED:
				return "UNINSTALLED";
			case BundleEvent.UNRESOLVED:
				return "UNRESOLVED";
			case BundleEvent.UPDATED:
				return "UPDATED";
			default:
				return "unknown event type: " + type;
		}
	}
}
