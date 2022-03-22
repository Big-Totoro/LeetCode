package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _716_Test {
    @Test
    public void test11() {
        _716.MaxStack maxStack = new _716.MaxStack();
        maxStack.push(5);
        maxStack.push(1);
        maxStack.push(5);
        assertThat(maxStack.top()).isEqualTo(5);
        assertThat(maxStack.popMax()).isEqualTo(5);
        assertThat(maxStack.top()).isEqualTo(1);
        assertThat(maxStack.peekMax()).isEqualTo(5);
        assertThat(maxStack.pop()).isEqualTo(1);
        assertThat(maxStack.top()).isEqualTo(5);
    }
}
