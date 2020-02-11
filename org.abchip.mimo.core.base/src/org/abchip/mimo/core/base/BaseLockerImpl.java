/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.entity.EntityIdentifiable;

public class BaseLockerImpl<N extends EntityIdentifiable> implements EntityLocker<N> {

	private ReentrantReadWriteLock lock;

	private URI address;

	public BaseLockerImpl(URI address) {
		this.address = address;

		this.lock = new ReentrantReadWriteLock();
	}

	@Override
	public URI getAddress() {
		return address;
	}

	@Override
	public void lock(LockType lockType) {

		switch (lockType) {
		case READ:
			lock.readLock().lock();
			break;
		case WRITE:
			lock.writeLock().lock();
			break;
		}
	}

	@Override
	public boolean tryLock(long time, LockType lockType) {

		try {
			switch (lockType) {
			case READ:
				return lock.readLock().tryLock(time, TimeUnit.MILLISECONDS);
			case WRITE:
				return lock.writeLock().tryLock(time, TimeUnit.MILLISECONDS);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}

		return false;
	}

	@Override
	public void unlock(LockType lockType) {

		switch (lockType) {
		case READ:
			lock.readLock().unlock();
		case WRITE:
			lock.writeLock().unlock();
		}
	}

	@Override
	public boolean isLocked(LockType lockType) {

		switch (lockType) {
		case READ:
			// return lock.readLock().
		case WRITE:
			// return lockWrite.tryLock();
		}

		return false;
	}
}