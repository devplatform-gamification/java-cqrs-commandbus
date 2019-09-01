package net.dathoang.cqrs.commandbus.middleware;

import net.dathoang.cqrs.commandbus.message.Message;

public interface NextFunction<T extends Message<R>, R> {
  R call(T message) throws Exception;
}
