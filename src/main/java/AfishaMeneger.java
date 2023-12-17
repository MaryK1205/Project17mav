public class AfishaMeneger {
    private AfishaItem[] items = new AfishaItem[0];
    private int resultLength = 3;

    public AfishaMeneger() {
        this.resultLength = resultLength;
    }

    public void add(AfishaItem item) {
        AfishaItem[] tmp = new AfishaItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public AfishaItem[] findAll() {
        return items;
    }

    public AfishaItem[] findLast(int resultLength) {
        AfishaItem[] reverse = new AfishaItem[resultLength];
        if (resultLength >= items.length) {
            for (int i = 0; i < items.length; i++) {
                reverse[i] = items[items.length - 1 - i];
            }
            return reverse;
        } else {
            for (int i = 0; i < resultLength; i++) {
                reverse[i] = items[items.length - 1 - i];
            }
            return reverse;
        }
    }

    public AfishaItem[] findLastNoResultLength() {
        AfishaItem[] reverse = new AfishaItem[items.length];
        for (int i = 0; i < items.length; i++) {
            reverse[i] = items[items.length - 1 - i];
        }
        return reverse;
    }

}
