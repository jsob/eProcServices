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

package tj.tipy.organizacij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.tipy.organizacij.exception.NoSuchtipy_organizacijException;
import tj.tipy.organizacij.model.tipy_organizacij;

/**
 * The persistence interface for the tipy_organizacij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.tipy.organizacij.service.persistence.impl.tipy_organizacijPersistenceImpl
 * @see tipy_organizacijUtil
 * @generated
 */
@ProviderType
public interface tipy_organizacijPersistence extends BasePersistence<tipy_organizacij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link tipy_organizacijUtil} to access the tipy_organizacij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tipy_organizacij in the entity cache if it is enabled.
	*
	* @param tipy_organizacij the tipy_organizacij
	*/
	public void cacheResult(tipy_organizacij tipy_organizacij);

	/**
	* Caches the tipy_organizacijs in the entity cache if it is enabled.
	*
	* @param tipy_organizacijs the tipy_organizacijs
	*/
	public void cacheResult(java.util.List<tipy_organizacij> tipy_organizacijs);

	/**
	* Creates a new tipy_organizacij with the primary key. Does not add the tipy_organizacij to the database.
	*
	* @param tipy_organizacij_id the primary key for the new tipy_organizacij
	* @return the new tipy_organizacij
	*/
	public tipy_organizacij create(long tipy_organizacij_id);

	/**
	* Removes the tipy_organizacij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij that was removed
	* @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	*/
	public tipy_organizacij remove(long tipy_organizacij_id)
		throws NoSuchtipy_organizacijException;

	public tipy_organizacij updateImpl(tipy_organizacij tipy_organizacij);

	/**
	* Returns the tipy_organizacij with the primary key or throws a {@link NoSuchtipy_organizacijException} if it could not be found.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij
	* @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	*/
	public tipy_organizacij findByPrimaryKey(long tipy_organizacij_id)
		throws NoSuchtipy_organizacijException;

	/**
	* Returns the tipy_organizacij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij, or <code>null</code> if a tipy_organizacij with the primary key could not be found
	*/
	public tipy_organizacij fetchByPrimaryKey(long tipy_organizacij_id);

	@Override
	public java.util.Map<java.io.Serializable, tipy_organizacij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipy_organizacijs.
	*
	* @return the tipy_organizacijs
	*/
	public java.util.List<tipy_organizacij> findAll();

	/**
	* Returns a range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @return the range of tipy_organizacijs
	*/
	public java.util.List<tipy_organizacij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy_organizacijs
	*/
	public java.util.List<tipy_organizacij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tipy_organizacij> orderByComparator);

	/**
	* Returns an ordered range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy_organizacijs
	*/
	public java.util.List<tipy_organizacij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tipy_organizacij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipy_organizacijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipy_organizacijs.
	*
	* @return the number of tipy_organizacijs
	*/
	public int countAll();
}