
package com.trial.excercise.repository.error;
public class RecordNotFoundException extends RuntimeException {

  public RecordNotFoundException(String  message) {
    super(message);
  }
}

