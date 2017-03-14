package cn.sharefish.groups.java8.stream;
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}