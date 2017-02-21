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

package tj.reestr.kontraktov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.reestr.kontraktov.exception.NoSuchreestr_kontraktovException;
import tj.reestr.kontraktov.model.reestr_kontraktov;

/**
 * The persistence interface for the reestr_kontraktov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.reestr.kontraktov.service.persistence.impl.reestr_kontraktovPersistenceImpl
 * @see reestr_kontraktovUtil
 * @generated
 */
@ProviderType
public interface reestr_kontraktovPersistence extends BasePersistence<reestr_kontraktov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link reestr_kontraktovUtil} to access the reestr_kontraktov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the reestr_kontraktov in the entity cache if it is enabled.
	*
	* @param reestr_kontraktov the reestr_kontraktov
	*/
	public void cacheResult(reestr_kontraktov reestr_kontraktov);

	/**
	* Caches the reestr_kontraktovs in the entity cache if it is enabled.
	*
	* @param reestr_kontraktovs the reestr_kontraktovs
	*/
	public void cacheResult(
		java.util.List<reestr_kontraktov> reestr_kontraktovs);

	/**
	* Creates a new reestr_kontraktov with the primary key. Does not add the reestr_kontraktov to the database.
	*
	* @param reestr_kontraktov_id the primary key for the new reestr_kontraktov
	* @return the new reestr_kontraktov
	*/
	public reestr_kontraktov create(java.lang.String reestr_kontraktov_id);

	/**
	* Removes the reestr_kontraktov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov that was removed
	* @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	*/
	public reestr_kontraktov remove(java.lang.String reestr_kontraktov_id)
		throws NoSuchreestr_kontraktovException;

	public reestr_kontraktov updateImpl(reestr_kontraktov reestr_kontraktov);

	/**
	* Returns the reestr_kontraktov with the primary key or throws a {@link NoSuchreestr_kontraktovException} if it could not be found.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov
	* @throws NoSuchreestr_kontraktovException if a reestr_kontraktov with the primary key could not be found
	*/
	public reestr_kontraktov findByPrimaryKey(
		java.lang.String reestr_kontraktov_id)
		throws NoSuchreestr_kontraktovException;

	/**
	* Returns the reestr_kontraktov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov, or <code>null</code> if a reestr_kontraktov with the primary key could not be found
	*/
	public reestr_kontraktov fetchByPrimaryKey(
		java.lang.String reestr_kontraktov_id);

	@Override
	public java.util.Map<java.io.Serializable, reestr_kontraktov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the reestr_kontraktovs.
	*
	* @return the reestr_kontraktovs
	*/
	public java.util.List<reestr_kontraktov> findAll();

	/**
	* Returns a range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @return the range of reestr_kontraktovs
	*/
	public java.util.List<reestr_kontraktov> findAll(int start, int end);

	/**
	* Returns an ordered range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reestr_kontraktovs
	*/
	public java.util.List<reestr_kontraktov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<reestr_kontraktov> orderByComparator);

	/**
	* Returns an ordered range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of reestr_kontraktovs
	*/
	public java.util.List<reestr_kontraktov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<reestr_kontraktov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the reestr_kontraktovs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of reestr_kontraktovs.
	*
	* @return the number of reestr_kontraktovs
	*/
	public int countAll();
}