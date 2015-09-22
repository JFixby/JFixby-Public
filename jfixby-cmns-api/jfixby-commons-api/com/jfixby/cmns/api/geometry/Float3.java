package com.jfixby.cmns.api.geometry;

public interface Float3 extends FixedFloat3 {

	void setXYZ(double x, double y, double z);

	void setXYZ(Float3 other);

	void setZ(double z);

}
