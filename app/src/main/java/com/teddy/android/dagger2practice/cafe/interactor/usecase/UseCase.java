package com.teddy.android.dagger2practice.cafe.interactor.usecase;

public interface UseCase<E> {

   void excute(Observer observer, E param);

   interface Observer<T> {
      void onUpdate(T value);
   }
}
