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

package tj.otpravlennye.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.otpravlennye.zajavki.exception.NoSuchotpravlennye_zajavkiException;
import tj.otpravlennye.zajavki.model.otpravlennye_zajavki;

/**
 * The persistence interface for the otpravlennye_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.otpravlennye.zajavki.service.persistence.impl.otpravlennye_zajavkiPersistenceImpl
 * @see otpravlennye_zajavkiUtil
 * @generated
 */
@ProviderType
public interface otpravlennye_zajavkiPersistence extends BasePersistence<otpravlennye_zajavki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link otpravlennye_zajavkiUtil} to access the otpravlennye_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the otpravlennye_zajavki in the entity cache if it is enabled.
	*
	* @param otpravlennye_zajavki the otpravlennye_zajavki
	*/
	public void cacheResult(otpravlennye_zajavki otpravlennye_zajavki);

	/**
	* Caches the otpravlennye_zajavkis in the entity cache if it is enabled.
	*
	* @param otpravlennye_zajavkis the otpravlennye_zajavkis
	*/
	public void cacheResult(
		java.util.List<otpravlennye_zajavki> otpravlennye_zajavkis);

	/**
	* Creates a new otpravlennye_zajavki with the primary key. Does not add the otpravlennye_zajavki to the database.
	*
	* @param otpravlennye_zajavki_id the primary key for the new otpravlennye_zajavki
	* @return the new otpravlennye_zajavki
	*/
	public otpravlennye_zajavki create(long otpravlennye_zajavki_id);

	/**
	* Removes the otpravlennye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki that was removed
	* @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	*/
	public otpravlennye_zajavki remove(long otpravlennye_zajavki_id)
		throws NoSuchotpravlennye_zajavkiException;

	public otpravlennye_zajavki updateImpl(
		otpravlennye_zajavki otpravlennye_zajavki);

	/**
	* Returns the otpravlennye_zajavki with the primary key or throws a {@link NoSuchotpravlennye_zajavkiException} if it could not be found.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki
	* @throws NoSuchotpravlennye_zajavkiException if a otpravlennye_zajavki with the primary key could not be found
	*/
	public otpravlennye_zajavki findByPrimaryKey(long otpravlennye_zajavki_id)
		throws NoSuchotpravlennye_zajavkiException;

	/**
	* Returns the otpravlennye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param otpravlennye_zajavki_id the primary key of the otpravlennye_zajavki
	* @return the otpravlennye_zajavki, or <code>null</code> if a otpravlennye_zajavki with the primary key could not be found
	*/
	public otpravlennye_zajavki fetchByPrimaryKey(long otpravlennye_zajavki_id);

	@Override
	public java.util.Map<java.io.Serializable, otpravlennye_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the otpravlennye_zajavkis.
	*
	* @return the otpravlennye_zajavkis
	*/
	public java.util.List<otpravlennye_zajavki> findAll();

	/**
	* Returns a range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @return the range of otpravlennye_zajavkis
	*/
	public java.util.List<otpravlennye_zajavki> findAll(int start, int end);

	/**
	* Returns an ordered range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of otpravlennye_zajavkis
	*/
	public java.util.List<otpravlennye_zajavki> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<otpravlennye_zajavki> orderByComparator);

	/**
	* Returns an ordered range of all the otpravlennye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otpravlennye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otpravlennye_zajavkis
	* @param end the upper bound of the range of otpravlennye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of otpravlennye_zajavkis
	*/
	public java.util.List<otpravlennye_zajavki> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<otpravlennye_zajavki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the otpravlennye_zajavkis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of otpravlennye_zajavkis.
	*
	* @return the number of otpravlennye_zajavkis
	*/
	public int countAll();
}