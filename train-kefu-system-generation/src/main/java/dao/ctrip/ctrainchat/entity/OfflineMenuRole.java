package dao.ctrip.ctrainchat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.ctrip.platform.dal.dao.annotation.Database;
import com.ctrip.platform.dal.dao.annotation.Sensitive;
import com.ctrip.platform.dal.dao.annotation.Type;
import java.sql.Types;
import java.sql.Timestamp;

import com.ctrip.platform.dal.dao.DalPojo;

/**
 * @author wql王全礼
 * @date 2018-08-30
 */
@Entity
@Database(name = "CtrainChat")
@Table(name = "offline_menu_role")
public class OfflineMenuRole implements DalPojo {

    /**
     * 主键
     */
    @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(value = Types.BIGINT)
	private Long id;

    /**
     * 菜单id
     */
	@Column(name = "menuId")
	@Type(value = Types.BIGINT)
	private Long menuId;

    /**
     * 角色id
     */
	@Column(name = "roleId")
	@Type(value = Types.BIGINT)
	private Long roleId;

    /**
     * 可用
     */
	@Column(name = "available")
	@Type(value = Types.TINYINT)
	private Integer available;

    /**
     * 创建时间
     */
	@Column(name = "create_time")
	@Type(value = Types.TIMESTAMP)
	private Timestamp createTime;

    /**
     * 最后更新时间
     */
	@Column(name = "DataChange_LastTime", insertable = false, updatable = false)
	@Type(value = Types.TIMESTAMP)
	private Timestamp datachangeLasttime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getDatachangeLasttime() {
		return datachangeLasttime;
	}

	public void setDatachangeLasttime(Timestamp datachangeLasttime) {
		this.datachangeLasttime = datachangeLasttime;
	}

}