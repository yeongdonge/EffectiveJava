package item10;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = (rangeCheck(areaCode, 999, "지역코드"));
        this.prefix = (rangeCheck(prefix, 999, "프리픽스"));
        this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + " : " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if( !(o instanceof PhoneNumber))
            return false;

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    private int hashCode;

    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0) {
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
        }
        return result;
    }

    /**
     * 전화번호의 문자열을 반환합니다.
     * 이 문자열은, 'XXX-YYY-ZZZZ'형태의 12글자로 구성됩니다.
     * XXX는 지역코드, YYY는 프리픽스, ZZZZ는 가입자 번호입니다.
     * 각각의 대문자는 10진수 숫자 하나를 나타냅니다.
     *
     * 전화번호의 각 부분의 값이 너무 작아서 자릿수를 채울 수 없다면,
     * 앞에서부터 0으로 채웁니다. 예를 들어 가입자 번호가 123이라면
     * 전화번호의 마지막 네 문자는 "0123"이 됩니다.
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }
}
