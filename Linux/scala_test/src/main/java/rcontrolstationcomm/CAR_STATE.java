package rcontrolstationcomm;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.FlagSet;
import org.bridj.ann.Runtime;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("RControlStationComm") 
public class CAR_STATE extends StructObject {
	public enum mc_fault_code implements IntValuedEnum<mc_fault_code > {
		FAULT_CODE_NONE(0),
		FAULT_CODE_OVER_VOLTAGE(1),
		FAULT_CODE_UNDER_VOLTAGE(2),
		FAULT_CODE_DRV8302(3),
		FAULT_CODE_ABS_OVER_CURRENT(4),
		FAULT_CODE_OVER_TEMP_FET(5),
		FAULT_CODE_OVER_TEMP_MOTOR(6);
		mc_fault_code(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<mc_fault_code > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<mc_fault_code > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};

	@Field(0) 
	public byte fw_major() {
		return this.io.getByteField(this, 0);
	}
	@Field(0) 
	public CAR_STATE fw_major(byte fw_major) {
		this.io.setByteField(this, 0, fw_major);
		return this;
	}
	@Field(1) 
	public byte fw_minor() {
		return this.io.getByteField(this, 1);
	}
	@Field(1) 
	public CAR_STATE fw_minor(byte fw_minor) {
		this.io.setByteField(this, 1, fw_minor);
		return this;
	}
	@Field(2) 
	public double roll() {
		return this.io.getDoubleField(this, 2);
	}
	@Field(2) 
	public CAR_STATE roll(double roll) {
		this.io.setDoubleField(this, 2, roll);
		return this;
	}
	@Field(3) 
	public double pitch() {
		return this.io.getDoubleField(this, 3);
	}
	@Field(3) 
	public CAR_STATE pitch(double pitch) {
		this.io.setDoubleField(this, 3, pitch);
		return this;
	}
	@Field(4) 
	public double yaw() {
		return this.io.getDoubleField(this, 4);
	}
	@Field(4) 
	public CAR_STATE yaw(double yaw) {
		this.io.setDoubleField(this, 4, yaw);
		return this;
	}
	/** C type : double[3] */
	@Array({3}) 
	@Field(5) 
	public Pointer<Double > accel() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : double[3] */
	@Array({3}) 
	@Field(6) 
	public Pointer<Double > gyro() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : double[3] */
	@Array({3}) 
	@Field(7) 
	public Pointer<Double > mag() {
		return this.io.getPointerField(this, 7);
	}
	@Field(8) 
	public double px() {
		return this.io.getDoubleField(this, 8);
	}
	@Field(8) 
	public CAR_STATE px(double px) {
		this.io.setDoubleField(this, 8, px);
		return this;
	}
	@Field(9) 
	public double py() {
		return this.io.getDoubleField(this, 9);
	}
	@Field(9) 
	public CAR_STATE py(double py) {
		this.io.setDoubleField(this, 9, py);
		return this;
	}
	@Field(10) 
	public double speed() {
		return this.io.getDoubleField(this, 10);
	}
	@Field(10) 
	public CAR_STATE speed(double speed) {
		this.io.setDoubleField(this, 10, speed);
		return this;
	}
	@Field(11) 
	public double vin() {
		return this.io.getDoubleField(this, 11);
	}
	@Field(11) 
	public CAR_STATE vin(double vin) {
		this.io.setDoubleField(this, 11, vin);
		return this;
	}
	@Field(12) 
	public double temp_fet() {
		return this.io.getDoubleField(this, 12);
	}
	@Field(12) 
	public CAR_STATE temp_fet(double temp_fet) {
		this.io.setDoubleField(this, 12, temp_fet);
		return this;
	}
	/** C type : mc_fault_code */
	@Field(13) 
	public IntValuedEnum<mc_fault_code > mc_fault() {
		return this.io.getEnumField(this, 13);
	}
	/** C type : mc_fault_code */
	@Field(13) 
	public CAR_STATE mc_fault(IntValuedEnum<mc_fault_code > mc_fault) {
		this.io.setEnumField(this, 13, mc_fault);
		return this;
	}
	@Field(14) 
	public double px_gps() {
		return this.io.getDoubleField(this, 14);
	}
	@Field(14) 
	public CAR_STATE px_gps(double px_gps) {
		this.io.setDoubleField(this, 14, px_gps);
		return this;
	}
	@Field(15) 
	public double py_gps() {
		return this.io.getDoubleField(this, 15);
	}
	@Field(15) 
	public CAR_STATE py_gps(double py_gps) {
		this.io.setDoubleField(this, 15, py_gps);
		return this;
	}
	@Field(16) 
	public double ap_goal_px() {
		return this.io.getDoubleField(this, 16);
	}
	@Field(16) 
	public CAR_STATE ap_goal_px(double ap_goal_px) {
		this.io.setDoubleField(this, 16, ap_goal_px);
		return this;
	}
	@Field(17) 
	public double ap_goal_py() {
		return this.io.getDoubleField(this, 17);
	}
	@Field(17) 
	public CAR_STATE ap_goal_py(double ap_goal_py) {
		this.io.setDoubleField(this, 17, ap_goal_py);
		return this;
	}
	@Field(18) 
	public double ap_rad() {
		return this.io.getDoubleField(this, 18);
	}
	@Field(18) 
	public CAR_STATE ap_rad(double ap_rad) {
		this.io.setDoubleField(this, 18, ap_rad);
		return this;
	}
	@Field(19) 
	public int ms_today() {
		return this.io.getIntField(this, 19);
	}
	@Field(19) 
	public CAR_STATE ms_today(int ms_today) {
		this.io.setIntField(this, 19, ms_today);
		return this;
	}
	public CAR_STATE() {
		super();
	}
	public CAR_STATE(Pointer pointer) {
		super(pointer);
	}
}
