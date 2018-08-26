package ObjectClass;

import java.util.Objects;

public class Sample {
    String text;

    public Sample(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Sample sample = (Sample) object;

        return text != null ? text.equals(sample.text) : sample.text == null;
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Sample sample = (Sample) o;
//        return Objects.equals(text, sample.text);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(text);
//    }
}
