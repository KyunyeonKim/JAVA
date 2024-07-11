package multi.java14;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {


        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서(인덱스)가 있는것(List), 순서가 없는것
        //(Set,Map)

        //1.List<제네릭 - 객체타입명시> -ArrayList
        List<Integer> list = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return 0;
            }

            @Override
            public Integer set(int index, Integer element) {
                return 0;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return 0;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };


        List<Integer>list2 = new ArrayList<>();
        list2.add(1111);
        list2.add(1111);
        list2.add(1111);
        list2.add(1111);
        System.out.println(list2);

        //데이터 길이
        System.out.println("list,size()"+list2.size());

        //데이터 획득
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));
        System.out.println(list2.get(3));

        //데이터 변경
        list2.set(1,2222);
        System.out.println(list2);

        //데이터 삭제
        list2.remove(2);
        System.out.println(list2);

        //데이터 모두삭제
        list2.clear();
        System.out.println("list size():"+list2.size());


//        List<Car>list3 = new ArrayList<>();
//
//        list3.set(1,new Car());
//        System.out.println(list3);

        List<String> list3 = new ArrayList<>();

        list3.add("2");


        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }






        //2.Set - HashSet

        //3.Map - HashMap,HashTable
    }
}
