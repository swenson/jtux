package jtux;

public class UErrorException extends java.lang.Exception {
	private int code;
	private int type;

	public static final int EC_ERRNO = 0;
	public static final int EC_EAI = 1;
	public static final int EC_GETDATE = 2;

	public UErrorException() {
	}
	public UErrorException(int code) {
		this.code = code;
		this.type = EC_ERRNO;
	}
	public UErrorException(int code, int type) {
		this.code = code;
		this.type = type;
	}

	public String toString() {
		String s, desc;
		try {
			switch (type) {
			case EC_ERRNO:
				s = UUtil.GetSymbolStr("errno", code);
				desc = UUtil.strerror(code);
				break;
			case EC_EAI:
				s = UUtil.GetSymbolStr("eai", code);
				desc = UNetwork.gai_strerror(code);
				break;
			case EC_GETDATE:
				s = UUtil.GetSymbolStr("getdate_err", code);
				desc = "getdate error";
				break;
			default:
				s = "[Unk. Type]";
				desc = "?";
			}
		}
		catch (Exception e) {
			s = "???";
			desc = "?";
		}
		return desc + " (" + s + ")";
	}
	public int getCode() {
		return code;
	}
	public int getType() {
		return type;
	}
}
