package FinalTest;

class Counter implements AutoCloseable {
    private int count = 0;
    private boolean isOpen = true;

    public void add() throws Exception {
        if (!isOpen) {
            throw new Exception("Ресурс закрыт!");
        }
        count++;
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Счетчик закрыт.");
    }
}

// Использование Counter в try-with-resources

