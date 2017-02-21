/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package tj.prochaja.informacija.dlja.zajavki.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
@ProviderType
public class NoSuchprochaja_informacija_dlja_zajavkiException extends NoSuchModelException {

	public NoSuchprochaja_informacija_dlja_zajavkiException() {
	}

	public NoSuchprochaja_informacija_dlja_zajavkiException(String msg) {
		super(msg);
	}

	public NoSuchprochaja_informacija_dlja_zajavkiException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchprochaja_informacija_dlja_zajavkiException(Throwable cause) {
		super(cause);
	}

}