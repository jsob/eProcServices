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

package tj.otozvannye.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.otozvannye.zajavki.exception.NoSuchotozvannye_zajavkiException;
import tj.otozvannye.zajavki.model.otozvannye_zajavki;

/**
 * The persistence interface for the otozvannye_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.otozvannye.zajavki.service.persistence.impl.otozvannye_zajavkiPersistenceImpl
 * @see otozvannye_zajavkiUtil
 * @generated
 */
@ProviderType
public interface otozvannye_zajavkiPersistence extends BasePersistence<otozvannye_zajavki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link otozvannye_zajavkiUtil} to access the otozvannye_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the otozvannye_zajavki in the entity cache if it is enabled.
	*
	* @param otozvannye_zajavki the otozvannye_zajavki
	*/
	public void cacheResult(otozvannye_zajavki otozvannye_zajavki);

	/**
	* Caches the otozvannye_zajavkis in the entity cache if it is enabled.
	*
	* @param otozvannye_zajavkis the otozvannye_zajavkis
	*/
	public void cacheResult(
		java.util.List<otozvannye_zajavki> otozvannye_zajavkis);

	/**
	* Creates a new otozvannye_zajavki with the primary key. Does not add the otozvannye_zajavki to the database.
	*
	* @param otozvannye_zajavki_id the primary key for the new otozvannye_zajavki
	* @return the new otozvannye_zajavki
	*/
	public otozvannye_zajavki create(long otozvannye_zajavki_id);

	/**
	* Removes the otozvannye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	* @return the otozvannye_zajavki that was removed
	* @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	*/
	public otozvannye_zajavki remove(long otozvannye_zajavki_id)
		throws NoSuchotozvannye_zajavkiException;

	public otozvannye_zajavki updateImpl(otozvannye_zajavki otozvannye_zajavki);

	/**
	* Returns the otozvannye_zajavki with the primary key or throws a {@link NoSuchotozvannye_zajavkiException} if it could not be found.
	*
	* @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	* @return the otozvannye_zajavki
	* @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	*/
	public otozvannye_zajavki findByPrimaryKey(long otozvannye_zajavki_id)
		throws NoSuchotozvannye_zajavkiException;

	/**
	* Returns the otozvannye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	* @return the otozvannye_zajavki, or <code>null</code> if a otozvannye_zajavki with the primary key could not be found
	*/
	public otozvannye_zajavki fetchByPrimaryKey(long otozvannye_zajavki_id);

	@Override
	public java.util.Map<java.io.Serializable, otozvannye_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the otozvannye_zajavkis.
	*
	* @return the otozvannye_zajavkis
	*/
	public java.util.List<otozvannye_zajavki> findAll();

	/**
	* Returns a range of all the otozvannye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otozvannye_zajavkis
	* @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	* @return the range of otozvannye_zajavkis
	*/
	public java.util.List<otozvannye_zajavki> findAll(int start, int end);

	/**
	* Returns an ordered range of all the otozvannye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otozvannye_zajavkis
	* @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of otozvannye_zajavkis
	*/
	public java.util.List<otozvannye_zajavki> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<otozvannye_zajavki> orderByComparator);

	/**
	* Returns an ordered range of all the otozvannye_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of otozvannye_zajavkis
	* @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of otozvannye_zajavkis
	*/
	public java.util.List<otozvannye_zajavki> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<otozvannye_zajavki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the otozvannye_zajavkis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of otozvannye_zajavkis.
	*
	* @return the number of otozvannye_zajavkis
	*/
	public int countAll();
}