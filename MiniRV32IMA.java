package me.electroboy404notfound.rv32ima;

public class MiniRV32IMAState {
	public long regs[] = new long[32];

	public long pc = 0;
	public long mstatus = 0;
	public long cyclel = 0;
	public long cycleh = 0;

	public long timerl = 0;
	public long timerh = 0;
	public long timermatchl = 0;
	public long timermatchh = 0;

	public long mscratch = 0;
	public long mtvec = 0;
	public long mie = 0;
	public long mip = 0;

	public long mepc = 0;
	public long mtval = 0;
	public long mcause = 0;

	// Note: only a few bits are used.  (Machine = 3, User = 0)
	// Bits 0..1 = privilege.
	// Bit 2 = WFI (Wait for longerrupt)
	// Bit 3+ = Load/Store reservation LSBs.
	public long extraflags = 0;
}

public class JNIFile {
  public native int MiniRV32IMAStep(MiniRV32IMAState state, long elapsedUs, int count);
}
