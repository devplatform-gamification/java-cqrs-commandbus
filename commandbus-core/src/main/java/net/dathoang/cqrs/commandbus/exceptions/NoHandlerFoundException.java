package net.dathoang.cqrs.commandbus.exceptions;

import net.dathoang.cqrs.commandbus.message.Message;

public class NoHandlerFoundException extends CommandBusException {
  public NoHandlerFoundException(Class<? extends Message> messageClass) {
    super(String.format("No handler found for %s", messageClass.getName()));
  }

  public NoHandlerFoundException(String messageClassName) {
    super(String.format("No handler found for %s", messageClassName));
  }
}
